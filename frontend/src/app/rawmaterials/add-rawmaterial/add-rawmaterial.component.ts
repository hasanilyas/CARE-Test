import { Component, OnInit } from '@angular/core';
import { RawmaterialService } from '../../rawmaterial.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-rawmaterial',
  templateUrl: './add-rawmaterial.component.html',
  styleUrls: ['./add-rawmaterial.component.css']
})
export class AddRawmaterialComponent implements OnInit {

  rawmaterial : any = {};
  constructor(private  rawmaterialService: RawmaterialService, private router: Router) { }

  ngOnInit() {
  }
 
  Add(formdata){
    console.log(formdata);
    this.rawmaterialService.addRawmaterial(formdata).subscribe(result =>{
    this.router.navigate(['/rawmaterials/add']);
    }, error => console.error(error))
  }
 
}
