import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const converted = parseFloat(amount) * 80;
    alert(`Converting to ${currency} Amount is ${converted}`);
  };

  return (
    <div>
      <h2 style={{ color: 'green', fontSize: '32px' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label style={{ marginRight: '40px' }}>
          Amount:
        </label>
        <input
        type="number"
        value={amount}
        onChange={(e) => setAmount(e.target.value)}
        style={{ marginBottom: '10px' }}
        />
        <br />
        <label style={{ marginRight: '35px'}}>
          Currency:
        </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            style={{ paddingBottom: '20px' }}
          />
        <br />
        <button type="submit" style={{ marginTop: '10px', marginLeft: '155px'}}>Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
