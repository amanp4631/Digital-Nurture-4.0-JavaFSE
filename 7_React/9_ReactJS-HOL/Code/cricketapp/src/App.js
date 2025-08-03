import React from 'react';
import ListOfPlayers from './Components/ListOfPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = true; // Toggle this to false to see IndianPlayers output

  const players = [
    { name: 'Jack', score: 90 },
    { name: 'Michael', score: 40 },
    { name: 'John', score: 80 },
    { name: 'David', score: 60 },
    { name: 'Steven', score: 65 },
    { name: 'Mark', score: 45 },
    { name: 'Robert', score: 84 },
    { name: 'Paul', score: 70 },
    { name: 'Abraham', score: 61 },
    { name: 'Jude', score: 64 },
    { name: 'Robin', score: 83 }
  ];

  const indianTeam = ['Sailesh', 'Dhoni', 'Vivek', 'Rohit', 'Anand', 'Sachin'];

  return (
    <div>
      {flag ? (
        <ListOfPlayers players={players} />
      ) : (
        <IndianPlayers team={indianTeam} />
      )}
    </div>
  );
}

export default App;
