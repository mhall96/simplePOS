import React from 'react';
import ReactDOM from 'react-dom';
//import '@appbaseio/reactivesearch/dist/css/style.min.css';

import './index.css';
import Routes from './Routes';
import LoginPage from "./LoginPage";
//import Home from "./Home";

import * as serviceWorker from './serviceWorker';

ReactDOM.render(<LoginPage />, document.getElementById('root'))

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.register();
