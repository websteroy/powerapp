import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class HeartbeatService {

  constructor(private http:HttpClient) { }

  getHeartbeats() {
    return this.http.get('/server/api/v1/heartbeats');
  }
}
