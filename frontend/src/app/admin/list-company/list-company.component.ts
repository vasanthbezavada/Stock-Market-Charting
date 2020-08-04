import { Component, OnInit } from '@angular/core';
import {Company} from '../../company';
import {CompanyService} from '../../service/company.service';

@Component({
  selector: 'app-list-company',
  templateUrl: './list-company.component.html',
  styleUrls: ['./list-company.component.css']
})
export class ListCompanyComponent implements OnInit {
  company: Company = new Company();
  visible = false;
  addVisible = false;

  companylist: any;

  constructor(private serv: CompanyService) { }

  ngOnInit() {
    this.serv.getAllCompanies().subscribe(data => {this.companylist = data; console.log(data); }, error => console.log(error));
  }
  // tslint:disable-next-line:typedef
  addCompany(company){
    console.log(company);
    this.serv.doRegistration(company).subscribe(data => {console.log(data); }, error => console.log(error));
    this.company = new Company();
    this.addVisible = false;
    this.ngOnInit();
    location.reload();
  }

  // tslint:disable-next-line:typedef
  delete(company) {
    console.log(company);
    this.serv.deleteCompany(company).subscribe(data => {console.log(data); }, error => console.log(error));
    this.company = new Company();
    this.addVisible = false;
    this.ngOnInit();
    location.reload();
  }

  // tslint:disable-next-line:typedef
  edit() {
    this.serv.updateCompany(this.company).subscribe(data => {console.log(data); }, error => console.log(error));
    this.company = new Company();
    this.visible = false;
    this.ngOnInit();
    location.reload();
  }

  // tslint:disable-next-line:typedef
  setFrame(company: any) {
    this.visible = true;
    this.company = company;
  }
}
