import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Company} from '../company';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StockService {

  constructor(private http: HttpClient) { }
  public doRegistration(exch): Observable<any>{
    return  this.http.post('http://localhost:8084/exchanges/add', exch);
  }
  public getAll(): Observable<any>{
    return  this.http.get('http://localhost:8084/exchanges/all');
  }
}
