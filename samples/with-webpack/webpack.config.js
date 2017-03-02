var path = require("path");
var webpack = require("webpack");

module.exports = {
    devtool: false,

    resolve: {
	    modules: [
		    "node_modules",
		    path.resolve("../../lib/kodando-es6/target/classes"),
		    path.resolve("../../lib/kodando-history/target/classes"),
		    path.resolve("../../lib/kodando-jest/target/classes"),
		    path.resolve("../../lib/kodando-mobx/target/classes"),
		    path.resolve("../../lib/kodando-mobx-location/target/classes"),
		    path.resolve("../../lib/kodando-react/target/classes"),
		    path.resolve("../../lib/kodando-react-dom/target/classes"),
		    path.resolve("../../lib/kodando-react-history/target/classes"),
		    path.resolve("../../lib/kodando-react-router/target/classes"),
		    path.resolve("../../lib/kodando-rxjs/target/classes"),
		    path.resolve("./rxjs-usage/target/classes"),
	    ]
    },

    entry: {
	    'rxjs-usage-bundled': [
		    'rxjs-usage'
	    ]
    },

    output: {
        path: path.join(__dirname, 'build'),
        filename: '[name].js',
        publicPath: '/build/'
    },

    plugins: [
        new webpack.DefinePlugin({
            'ENVIRONMENT': JSON.stringify("production"),
            'process.env': {
                'NODE_ENV': JSON.stringify("production")
            }
        })
    ]
};