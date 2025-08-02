import React from "react";
import FlightDetails from "./FlightDetails";

const GuestPage = ({ onLogin }) => {
  return (
    <div>
      <h2>Please sign up to book your flight.</h2>
      <button onClick={onLogin}>Login</button>
      <FlightDetails isLoggedIn={false} />
    </div>
  );
};

export default GuestPage;
