import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails
        title="React Bootcamp"
        startDate="2025-06-01"
        endDate="2025-07-15"
        status="ongoing"
      />
      <CohortDetails
        title="Java Fundamentals"
        startDate="2025-04-01"
        endDate="2025-05-15"
        status="completed"
      />
    </div>
  );
}

export default App;
