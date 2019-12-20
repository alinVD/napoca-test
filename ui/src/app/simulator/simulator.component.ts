import { Component } from '@angular/core';

import { SimulatorService } from './simulator.service';

@Component({
  selector: 'simulator-root',
  templateUrl: './simulator.component.html',
  styleUrls: ['./simulator.component.css']
})
export class SimulatorComponent {
  data: string;

  // private simulatorService: SimulatorService

  constructor(private simulatorService: SimulatorService) {
  }

  /**
   * This method is used to test the post request
   */
  public bruh(): void {
    this.simulatorService.sendRequest().subscribe((data: any) => {
      this.data = data.content;
      console.log(data);
    });
  }
}
