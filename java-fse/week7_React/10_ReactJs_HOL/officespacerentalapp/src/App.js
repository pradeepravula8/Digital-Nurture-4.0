import React from 'react';
import OfficeCard from './Components/OfficeCard';

function App() {
  const office = {
    name: 'luxurious workspace',
    rent: 5000000,
    address: 'Banglore',
    image: '/images/office.jpg'  // 👈 This is the correct path from public
  };

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <h1 style={{ fontWeight: 'bold' }}>Office Space , at Affordable Range</h1>
      <OfficeCard office={office} />
    </div>
  );
}

export default App;
