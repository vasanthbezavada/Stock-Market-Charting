import { Component, OnInit } from '@angular/core';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent implements OnInit {
  dataOfExcel: any;

  constructor() {
  }
    onFileChange(ev){
      const file = ev.target.files[0];
      let workBook = null;
      let jsonData = null;
      const reader = new FileReader();

      reader.onload = (event) => {
        console.log('ji');
        const data = reader.result;
        workBook = XLSX.read(data, { type: 'binary' });
        jsonData = workBook.SheetNames.reduce((initial, name) => {
          const sheet = workBook.Sheets[name];
          initial[name] = XLSX.utils.sheet_to_json(sheet);
          return initial;
        }, {});
        const dataString = JSON.stringify(jsonData);
        document.getElementById('output').innerHTML = dataString.slice(0, 300).concat('...');
        console.log(dataString);
        this.dataOfExcel = dataString;
      };
    }
    uploadDocument()
    {

    }

    ngOnInit()
    {

    }

  }


