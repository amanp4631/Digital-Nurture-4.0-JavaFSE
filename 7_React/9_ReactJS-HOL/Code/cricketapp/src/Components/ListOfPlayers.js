import React from 'react';

const ListOfPlayers = ({ players }) => {
  const players70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h1>List of Players</h1>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            Mr. {player.name} {player.score}
          </li>
        ))}
      </ul>

      <h1>List of Players having Scores Less than 70</h1>
      <ul>
        {players70.map((player, index) => (
          <li key={index}>
            Mr. {player.name} {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
