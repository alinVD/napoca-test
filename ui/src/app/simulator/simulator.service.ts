import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/index';

@Injectable({
  providedIn: 'root'
})
export class SimulatorService {
  private serviceUrl = '/api/simulator/start';


  constructor(private http: HttpClient) { }

  
  public sendRequest(): Observable<any> {
    return this.http.post(this.serviceUrl, {});
  }

}
