import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const handleSubmit = (e) => {
    e.preventDefault();
    const rupees = parseFloat(amount);
    const conversionRate = 80; // ₹1 = €0.0125 → reverse: €1 = ₹80
    const converted = rupees * conversionRate;

    alert(`Converting to ${currency} Amount is ${converted}`);
  };

  return (
    <div style={{ border: '1px solid black', padding: '20px', marginTop: '20px' }}>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>

        <br />

        <div>
          <label>Currency: </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>

        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
