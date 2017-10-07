const webpack = require("webpack");
const path = require("path");

// configurations
const production = process.argv.indexOf("-p") >= 0;
const development = !production;
const targetDir = path.resolve('./www');

function when(condition, data) {
    if (!condition) {
        return [];
    }

    if (Array.isArray(data)) {
        return data;
    }

    return [...arguments].slice(1);
}

// webpack configuration
module.exports = {
    entry: {
        'sample1-react': [
            'sample1-react'
        ],

        'vendor': [
            'kotlin'
        ]
    },

    module: {
        rules: [
            ...when(development, [
                {test: /\.js$/, use: ['source-map-loader'], enforce: "pre"}
            ]),
            {test: /\.css$/, loaders: ['style-loader', 'css-loader']},
            {test: /\.less$/, loaders: ['style-loader', 'css-loader', 'less-loader']},
            {test: /\.scss$/, loaders: ['style-loader', 'css-loader', 'sass-loader']},
            {test: /\.(png|woff|woff2|eot|ttf|svg)$/, loader: 'url-loader?limit=100000'}
        ]
    },

    output: {
        path: path.join(targetDir, "js"),
        filename: '[name].js',
        publicPath: '/js'
    },

    resolve: {
        modules: [
            ...when(development, [
                path.resolve('./samples/sample1-react/build/js/dependencies'),
                path.resolve('./samples/sample1-react/build/js'),
            ]),

            ...when(production, [
                path.resolve('./samples/sample1-react/build/js/min'),
            ]),

            'node_modules'
        ]
    },

    plugins: [
        ...when(production, [
            new webpack.DefinePlugin({
                'process.env': {
                    'NODE_ENV': JSON.stringify('production')
                }
            })
        ]),

        new webpack.optimize.CommonsChunkPlugin({
            name: 'vendor',
            minChunks: function (module) {
                return module.context && module.context.indexOf("node_modules") !== -1;
            }
        }),

        ...when(production, [
            new webpack.optimize.UglifyJsPlugin({
                output: {
                    beautify: false
                }
            })
        ]),

        new webpack.NoEmitOnErrorsPlugin()
    ],

    devServer: {
        contentBase: targetDir,
        compress: true,
        hot: true,
        port: 3000
    }
};