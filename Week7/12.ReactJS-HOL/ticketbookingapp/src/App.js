import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: 'center', marginTop: '200px', fontSize: '24px' }}>
      <h1>{isLoggedIn ? 'Welcome back' : 'Please sign up.'}</h1>
      <button onClick={isLoggedIn ? handleLogoutClick : handleLoginClick}
        style={{marginRight: '270px', fontSize: '16px'}}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
    </div>
  );
}

export default App;
