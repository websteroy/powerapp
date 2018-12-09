import { Component, OnInit } from '@angular/core';
import { HeartbeatService } from '../../services/heartbeat.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  public heartbeats;

  constructor(private hbService: HeartbeatService) { }

  ngOnInit() {
    this.getHeartbeats();
  }

  getHeartbeats() {
    this.hbService.getHeartbeats().subscribe(
      data => {this.heartbeats = data},
      err => console.error(err),
      () => console.log('Heartbeats loaded.')
    );
  }
}
