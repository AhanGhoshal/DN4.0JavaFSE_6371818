const ListofIndianPlayers = () => {
  const T20players = [
    'Mr. First Player',
    'Mr. Second Player',
    'Mr. Third Player'
  ];

  const RanjiTrophyPlayers = [
    'Mr. Fourth Player',
    'Mr. Fifth Player',
    'Mr. Sixth Player'
  ];

  const merged = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>List of Indian Players Merged:</h2>
        {merged.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
    </div>
  );
};

export default ListofIndianPlayers;