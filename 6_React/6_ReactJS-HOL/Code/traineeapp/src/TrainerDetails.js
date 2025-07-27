import React from 'react';
import { useParams } from 'react-router-dom';
import TrainersMock from './TrainersMock';

function TrainerDetails() {
  const { id } = useParams();
  const trainer = TrainersMock.find(t => t.trainerId === parseInt(id));

  if (!trainer) return <p>Trainer not found.</p>;

  return (
    <div>
      <h2>Trainer Details</h2>
      <h3><strong>{trainer.name}</strong></h3> 
      <p>{trainer.email}</p>
      <p>{trainer.phone}</p>
      {/* Technology: {trainer.technology} */}
      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetails;
