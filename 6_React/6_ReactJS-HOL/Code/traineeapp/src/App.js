import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainerList from './TrainerList';
import TrainerDetails from './TrainerDetails';
import TrainersMock from './TrainersMock';

function App() {
  return (
    <Router>
      <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
        <h1>My Academy Trainers App</h1>
        <nav style={{ marginBottom: '15px', display: "flex", alignItems: "center" }}>
          <Link to="/" style={{ marginRight: '15px' }}>Home</Link> <pre>|   </pre>
          <Link to="/trainers">Show Trainers</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainerList trainers={TrainersMock} />} />
          <Route path="/trainer/:id" element={<TrainerDetails />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
