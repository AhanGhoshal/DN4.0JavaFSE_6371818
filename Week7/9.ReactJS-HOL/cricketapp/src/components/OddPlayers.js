const OddPlayers = () => {
  const players = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];
  const [first, , third, , fifth] = players;

  return (
    <div>
      <h2>Odd Players</h2>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
    </div>
  );
};

export default OddPlayers;
