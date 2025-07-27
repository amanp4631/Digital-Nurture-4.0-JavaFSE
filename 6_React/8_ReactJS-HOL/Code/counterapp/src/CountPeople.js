// src/CountPeople.js
import React from 'react';
import './CountPeople.css';

class CountPeople extends React.Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  };

  render() {
    return (
      <div className="main-container">
        <div className="box">
          <button className="entry-btn" onClick={this.updateEntry}>
            Login ➜
          </button>
          <p>{this.state.entrycount} People Entered!!</p>
        </div>

        <div className="box">
          <button className="exit-btn" onClick={this.updateExit}>
            Exit ➜
          </button>
          <p>{this.state.exitcount} People Left!!</p>
        </div>
      </div>
    );
  }
}

export default CountPeople;
