import React from 'react';

const OddPlayers = ({ team }) => {
  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First: {team[0]}</li>
        <li>Third: {team[2]}</li>
        <li>Fifth: {team[4]}</li>
      </ul>
    </div>
  );
};

const EvenPlayers = ({ team }) => {
  return (
    <div>
      <h2>Even Players</h2>
      <ul>
        <li>Second: {team[1]}</li>
        <li>Fourth: {team[3]}</li>
        <li>Sixth: {team[5]}</li>
      </ul>
    </div>
  );
};

const ListIndianPlayers = ({ players }) => {
  return (
    <div>
      <h2>List of Indian Players Merged:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
};

const IndianPlayers = ({ team }) => {
  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <OddPlayers team={team} />
      <EvenPlayers team={team} />
      <ListIndianPlayers players={mergedPlayers} />
    </div>
  );
};

export default IndianPlayers;
