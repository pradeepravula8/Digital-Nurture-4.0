import React from 'react';

function OfficeCard({ office }) {
  const rentStyle = {
    color: office.rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  };

  return (
    <div>
      <img
        src={office.image}
        alt={office.name}
        style={{ width: '300px', height: '200px', marginBottom: '10px' }}
      />
      <h2>Name: {office.name}</h2>
      <p style={rentStyle}>Rent: Rs. {office.rent}</p>
      <p><strong>Address:</strong> {office.address}</p>
    </div>
  );
}

export default OfficeCard;
