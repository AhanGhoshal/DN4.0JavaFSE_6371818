const Scorebelow70 = () => {
  const players = [
    { name: 'Mr. Jack', score: 50 },
    { name: 'Mr. Michael', score: 70 },
    { name: 'Mr. John', score: 40 },
    { name: 'Mr. Ann', score: 61 },
    { name: 'Mr. Elisabeth', score: 61 },
    { name: 'Mr. Jadeja', score: 64 }
  ];

  return (
    <div>
      <h2>List of Players having Scores Less than 70</h2>
        {players.map((player, idx) => (
          <li key={idx}>{player.name} {player.score}</li>
        ))}
    </div>
  );
};

export default Scorebelow70;
