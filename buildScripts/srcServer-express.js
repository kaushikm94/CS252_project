import express from 'express';
import path from 'path';
import open from 'open';

//import webpack from 'webpack';
//import config from '../webpack.config.dev';

const port = 8181;
const app = express();
// const compile = webpack(config);

//app.use(require('webpack-dev-middleware')(compiler, {
 // noInfo: true,
 //  publicPath: config.output.publicPath
//}));

app.get('/', function(req, res) {
  res.sendFile(path.join(__dirname,'../src/landingPage.html'))
  //res.sendFile(path.join(__dirname,'../src/bootstrap/dist/css/custom.css'))
});

app.listen(port, function(err) {
  if (err) {
    console.log(err);
  } else {
    open('http://localhost:' + port);
  }
});

