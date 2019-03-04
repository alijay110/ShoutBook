import React,{Component} from 'react';
import UserList from '../components/UserList.jsx';

class App extends React.Component {

  render() {
    return (
      <div>
        
        <h1>Welcome to React</h1>
       <UserList/>
       
      </div>
    );
  }
}

export default App;