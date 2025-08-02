import React from "react";

const FlightDetails = ({ isLoggedIn }) => {
  const flights = [
    {
      id: 1,
      from: "Hyderabad",
      to: "Delhi",
      airline: "IndiGo",
      time: "10:00 AM",
      duration: "2h 10m",
      stops: "Non-stop",
      price: 3200,
    },
    {
      id: 2,
      from: "Chennai",
      to: "Bangalore",
      airline: "AirAsia",
      time: "12:30 PM",
      duration: "1h 00m",
      stops: "Non-stop",
      price: 1800,
    },
    {
      id: 3,
      from: "Mumbai",
      to: "Kolkata",
      airline: "SpiceJet",
      time: "5:45 PM",
      duration: "2h 50m",
      stops: "1 Stop",
      price: 3900,
    },
  ];

  return (
    <div>
      <h3 style={{ marginTop: "20px" }}>Available Flights</h3>
      {flights.map((flight) => (
        <div key={flight.id} style={{ border: "1px solid #ccc", padding: "10px", margin: "10px 0" }}>
          <strong>{flight.from} → {flight.to}</strong><br />
          Airline: {flight.airline}<br />
          Time: {flight.time}, Duration: {flight.duration}, Stops: {flight.stops}<br />
          Price: ₹{flight.price}<br />
          {isLoggedIn ? (
            <button style={{ marginTop: "5px" }}>Book Now</button>
          ) : (
            <button disabled style={{ marginTop: "5px" }}>Login to Book</button>
          )}
        </div>
      ))}
    </div>
  );
};

export default FlightDetails;
