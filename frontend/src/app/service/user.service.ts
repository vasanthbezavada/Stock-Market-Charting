import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Credentials} from '../Credentials';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  public verify(credential: Credentials): Observable<any>{
    return this.http.post('http://localhost:8083/user/verify', credential );
  }
}
