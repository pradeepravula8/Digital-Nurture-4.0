import React, { useState } from 'react';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(1);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
    sayMessage("Incremented!");
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello from React!");
  };

  const sayMessage = (msg) => {
    console.log(msg);
  };

  const sayWelcome = (text) => {
    alert(`Welcome Message: ${text}`);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <p>{count}</p>
      <button onClick={increment}>Increment</button>
      <br /><br />
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>
      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
