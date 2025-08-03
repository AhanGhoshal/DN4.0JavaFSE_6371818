import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import Scorebelow70 from './components/Scorebelow70';
import OddPlayers from './components/OddPlayers';
import EvenPlayers from './components/EvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';

function App() {
  const flag = true;

  return (
    <div className="App">
      {flag ? (
        <>
          <ListofPlayers />
          <hr />
          <Scorebelow70 />
        </>
      ) : (
        <>
          <OddPlayers />
          <EvenPlayers />
          <hr />
          <ListofIndianPlayers />
        </>
      )}
    </div>
  );
}

export default App;
