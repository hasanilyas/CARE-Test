import { Component, OnInit } from '@angular/core';
import { RawmaterialService } from '../../rawmaterial.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-rawmaterial-list',
  templateUrl: './rawmaterial-list.component.html',
  styleUrls: ['./rawmaterial-list.component.css']
})
export class RawmaterialListComponent implements OnInit {

  rawmaterials: Array<any>;
  
  constructor(private  rawmaterialService: RawmaterialService, private router: Router) { }
 
  ngOnInit() {
    this.rawmaterialService.getAll().subscribe(data =>{
      this.rawmaterials = data;
    });
  }

  deleteRawmaterial(rawmaterial){
    
    this.rawmaterialService.deleteRawmaterial(rawmaterial).subscribe(result =>{
      this.router.navigate(['/rawmaterials']);
    }, error => console.error(error))
  }

  rawmaterialDetails(rawmaterial){
    
  }

}
