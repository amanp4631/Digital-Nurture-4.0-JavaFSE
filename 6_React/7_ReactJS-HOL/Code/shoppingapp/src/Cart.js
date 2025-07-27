// src/Cart.js
import React from 'react';
import './Cart.css'; // CSS file for styling

class Cart extends React.Component {
  render() {
    return (
      <table className="cart-table">
        <thead>
          <tr>
            <th>Name</th>
            <th>Price (₹)</th>
          </tr>
        </thead>
        <tbody>
          {this.props.item.map((item, index) => (
            <tr key={index}>
              <td>{item.itemname}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    );
  }
}

export default Cart;
