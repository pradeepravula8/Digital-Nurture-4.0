import React from 'react';

function ListofPlayers() {
  const players = [
    { name: 'Mr. Lucky', score: 50 },
    { name: 'Mr. Bumrah', score: 70 },
    { name: 'Mr. Gill', score: 40 },
    { name: 'Mr. Siraj', score: 61 },
    { name: 'Mr. Aliean', score: 61 },
    { name: 'Mr. Sachin', score: 95 },
    { name: 'Mr. Dhoni', score: 100 },
    { name: 'Mr. Virat', score: 84 },
    { name: 'Mr. Jadeja', score: 64 },
    { name: 'Mr. Raina', score: 75 },
    { name: 'Mr. Rohit', score: 80 },
  ];

  const lowScorers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} {player.score}
          </li>
        ))}
      </ul>

      <h2>List of Players having Scores Less than 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
