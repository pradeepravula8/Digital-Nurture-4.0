import React from "react";
import FlightDetails from "./FlightDetails";

const UserPage = ({ onLogout }) => {
  return (
    <div>
      <h2>Welcome back</h2>
      <button onClick={onLogout}>Logout</button>
      <p style={{ marginTop: "10px" }}>You are now eligible to book tickets.</p>
      <FlightDetails isLoggedIn={true} />
    </div>
  );
};

export default UserPage;
