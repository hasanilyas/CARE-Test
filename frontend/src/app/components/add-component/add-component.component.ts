import { Component, OnInit } from '@angular/core';
import { ComponentsService } from '../../components.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-component',
  templateUrl: './add-component.component.html',
  styleUrls: ['./add-component.component.css']
})
export class AddComponentComponent implements OnInit {

  component : any = {};
  constructor(private  componentsService: ComponentsService, private router: Router) { }

  ngOnInit() {
  }
 
  Add(formdata){
    console.log(formdata);
    this.componentsService.addComponent(formdata).subscribe(result =>{
    this.router.navigate(['/components/add']);
    }, error => console.error(error))
  }
}
