import { Component, OnInit } from '@angular/core';
import {StockService} from '../../service/stock.service';


@Component({
  selector: 'add-stock-exchange',
  templateUrl: './add-stock-exchange.component.html',
  styleUrls: ['./add-stock-exchange.component.css']
})
export class AddStockExchangeComponent implements OnInit {


  constructor(private serv: StockService) { }
 exchange = {
    id: '',
    stockExchange: ''
  };
  exchangeList: any;

  ngOnInit() {
    this.serv.getAll().subscribe(data => {console.log(data); this.exchangeList = data; console.log(this.exchangeList); }, error => console.log(error));
  }


  add() {
    this.serv.doRegistration(this.exchange).subscribe(data => {console.log(data); }, error => console.log(error));
    location.reload();
  }
}
