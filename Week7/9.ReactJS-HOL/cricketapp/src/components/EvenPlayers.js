const EvenPlayers = () => {
  const players = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];
  const [, second, , fourth, , sixth] = players;

  return (
    <div>
      <h2>Even Players</h2>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
    </div>
  );
};

export default EvenPlayers;
