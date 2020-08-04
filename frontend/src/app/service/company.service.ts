import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Company} from '../company';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {


  constructor(private http: HttpClient) { }

  public getAllCompanies(): Observable<any>{
    return this.http.get('http://localhost:8081/companies/all');
  }
  public doRegistration(company: Company): Observable<any>{
  return  this.http.post('http://localhost:8081/companies/add', company);
  }
  public deleteCompany(company: Company): Observable<any>{
    return  this.http.post('http://localhost:8081/companies/delete', company);
  }
  public updateCompany(company: Company): Observable<any>{
    return  this.http.post('http://localhost:8081/companies/update', company);
  }
}
