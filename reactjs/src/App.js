import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import { Row, Container } from 'react-bootstrap';
import { Link } from 'react-router-dom';

class App extends Component {
  render() {
    return (
      <Container style={{ marginTop:50, marginLeft:100 }}>
        <div className="App">
          <Row style={{ marginLeft: 100, marginBottosm: 10 }}>
            <nav className="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
              <ul className="navbar-nav">
                <li className="nav-item" style={{ minWidth: 100, marginRight: 20, marginLeft :100 }}>
                  <Link to="/home" >Home</Link>
                </li>
                <li className="nav-item" style={{ minWidth: 100, marginRight: 20 }}>
                  <Link to="/retail/list">Seach Product</Link>
                </li>
                <li className="nav-item" style={{ minWidth: 100, marginRight: 20 }}>
                  <Link to="/retail/add">Add Product </Link>
                </li>
                <li className="nav-item" style={{ minWidth: 100, marginRight: 20 }}>
                  <Link to="/bill/add">Add Bill </Link>
                </li>
              </ul>
            </nav>
          </Row>
        </div>
      </Container>
    );
  }
}

export default App;
