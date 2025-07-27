import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "lucky";
  const school = "oxford";
  const total = 280;
  const maxScore = 300;
  const percentage = ((total / maxScore) * 100).toFixed(2);

  return (
    <div className="container">
      <h1>Student Details:</h1>
      <p><strong className="label blue">Name:</strong> <span className="value">{name}</span></p>
      <p><strong className="label red">School:</strong> <span className="value">{school}</span></p>
      <p><strong className="label purple">Total:</strong> <span className="value">{total} Marks</span></p>
      <p><strong className="label green">Score:</strong><span className="value">{percentage}%</span></p>
    </div>
  );
}

export default CalculateScore;
