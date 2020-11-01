---
description: 'https://blog.ag-grid.com/react-get-started-with-react-grid-in-5-minutes/'
---

# React AG-Grid

[Ag Grid Tutorial ](https://www.ag-grid.com/react-grid/)

```typescript

import logo from './logo.svg';
import React,{Component} from 'react'
import './App.css';
import { AgGridReact,AgGridColumn } from 'ag-grid-react';
import 'ag-grid-community/dist/styles/ag-grid.css';
import 'ag-grid-community/dist/styles/ag-theme-balham.css';

class App extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
        columnDefs: [
            {headerName: "Make", field: "make"},
            {headerName: "Model", field: "model"},
            {headerName: "Price", field: "price"}

        ],
        rowData: [
            {make: "Toyota", model: "Celica", price: 35000},
            {make: "Ford", model: "Mondeo", price: 32000},
            {make: "Porsche", model: "Boxter", price: 72000}
        ]
    }
}


  render() {
      return (
          <div
              className="ag-theme-balham"
              style={{ height: '200px', width: '600px' }}
          >
             <AgGridReact
                rowData={this.state.rowData}>
                <AgGridColumn sortable={true} filter={true} field="make"></AgGridColumn>
                <AgGridColumn sortable={true} filter={true} field="model"></AgGridColumn>
                <AgGridColumn sortable={true} filter={true} field="price"></AgGridColumn>
            </AgGridReact>
          </div>
      );
  }
}

export default App;


```

