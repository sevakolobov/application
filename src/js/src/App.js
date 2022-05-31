import './App.css';
import { Component } from 'react';
import {getAllBuyers} from './client'

class App extends Component {
  render() {
    getAllBuyers().then(res => res.json().then(buyers => {
      console.log(buyers); 
    })); 
    return <h1>Hello world </h1>
  }
}

export default App;
