import React, { Component } from 'react';


class UserList extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      users: {},
      isLoading: false
    };
  }

  
  componentDidMount() {
    this.setState({isLoading: true});
    
    fetch('http://localhost:8181/users')
      .then( response => response.json())
      .then( data =>
          this.setState({
            users: data,
            isLoading: false
          })
        )
      .catch(error => this.setState({
          error,
          isLoading:false
      })
    )
  }



  render() {
    const {users, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div>
        <h2>User List</h2>
        <div key={users.name}>
          {users.name}<br/>
        </div>
      </div>
    );
  }

}

export default UserList;