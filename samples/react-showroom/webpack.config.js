var path = require('path');
var webpack = require('webpack');
var chalk = require("chalk");
var isDevBuild = process.argv.indexOf("-p") == -1;


if (isDevBuild) {
    console.log("Building - Environment: ", chalk.bgYellow.black("development"));
} else {
    console.log("Building - Environment: ", chalk.bgGreen.black("production"));
}

module.exports = {
    devtool: false,

    entry: {
        "react-showroom": [
            "./target/classes/react-showroom.js"
        ],

        "vendor": [
            "kotlin",
            "react",
            "react-dom",
            "react-router-dom"
        ]
    },

    output: {
        path: path.resolve("./www/lib"),
        filename: '[name].js',
        publicPath: '/lib/'
    },

    resolve: {
        extensions: [".webpack.js", ".web.js", ".ts", ".tsx", ".jsx", ".js"],
        alias: {
            "kodando-runtime": path.resolve("../../modules/kodando-runtime.js"),
            "kodando-rxjs": path.resolve("../../modules/kodando-rxjs.js"),
            "kodando-react": path.resolve("../../modules/kodando-react.js"),
            "kodando-react-dom": path.resolve("../../modules/kodando-react-dom.js"),
            "kodando-react-router": path.resolve("../../modules/kodando-react-router.js"),
        }
    },

    module: {
        rules: [
            {
                test: /\.scss$/,
                loaders: [
                    "style-loader",
                    "css-loader",
                    "sass-loader"
                ]
            }
        ]
    },

    plugins: isDevBuild
        ? [
            new webpack.optimize.CommonsChunkPlugin('vendor'),
            new webpack.DefinePlugin({
                'ENVIRONMENT': JSON.stringify('development')
            }),
            new webpack.NoEmitOnErrorsPlugin()
        ]
        : [
            // Plugins that apply in production builds only
            new webpack.DefinePlugin({
                'ENVIRONMENT': JSON.stringify('production'),
                'process.env': {
                    'NODE_ENV': JSON.stringify('production')
                }
            }),

            new webpack.ProvidePlugin({
                numeral: "numeral"
            }),

            new webpack.optimize.CommonsChunkPlugin('vendor'),

            new webpack.LoaderOptionsPlugin({
                minimize: true,
                debug: false
            }),

            new webpack.optimize.UglifyJsPlugin({
                compress: {
                    warnings: false
                },
                output: {
                    comments: false
                },
                sourceMap: false
            }),
        ],

    devServer: {
        port: 3000,
        compress: true,
        contentBase: "./www"
    }
};
