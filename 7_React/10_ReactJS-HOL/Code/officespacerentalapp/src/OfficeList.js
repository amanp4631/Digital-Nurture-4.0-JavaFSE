// src/OfficeList.js
import React from "react";

function OfficeList() {
  const officeTitle = "Office Space";

  const officeItems = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image:
        "https://cdn.pixabay.com/photo/2015/04/20/06/46/office-730681_1280.jpg",
    },
    {
      Name: "Regus",
      Rent: 70000,
      Address: "Bangalore",
      Image:
        "https://img.freepik.com/free-photo/modern-office-space-interior_158595-5206.jpg",
    },
    {
      Name: "SmartWorks",
      Rent: 60000,
      Address: "Pune",
      Image:
        "https://images.pexels.com/photos/380769/pexels-photo-380769.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    },
  ];

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h1>{officeTitle}, at Affordable Range</h1>

      {officeItems.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? "red" : "green";

        return (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              margin: "20px auto",
              padding: "10px",
              maxWidth: "600px",
              borderRadius: "10px",
            }}
          >
            <img
              src={item.Image}
              width="100%"
              height="300px"
              alt={item.Name}
              style={{ objectFit: "cover", borderRadius: "10px" }}
            />
            <h3>Name: {item.Name}</h3>
            <h3 style={{ color: rentColor }}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default OfficeList;
