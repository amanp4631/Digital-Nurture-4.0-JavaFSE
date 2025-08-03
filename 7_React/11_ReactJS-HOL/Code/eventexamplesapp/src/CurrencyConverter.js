import React, { useState } from 'react';

function CurrencyConverter() {
  const [counter, setCounter] = useState(0);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleIncrement = () => {
    setCounter(prev => prev + 1);
    alert("Hello! Value incremented.");
  };

  const handleDecrement = () => {
    setCounter(prev => prev - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      const converted = amount * 0.011; // example conversion rate
      alert(`Converting to Euro. Amount is: ${converted.toFixed(2)}€`);
    } else {
      alert("Currency not supported.");
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>React App</h1>
      <p>{counter}</p>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <button onClick={() => sayWelcome("Welcome")}>Say welcome</button>
      <button onClick={handleClick}>Click on me</button>

      <h3 style={{ color: 'green' }}>Currency Convertor!!!</h3>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency: </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;