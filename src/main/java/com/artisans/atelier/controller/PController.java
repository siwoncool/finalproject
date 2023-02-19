package com.artisans.atelier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/index")
    public String index1(){
        return "index";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/workspaceBoard")
    public String workspaceBoard(){
        return "workspaceBoard";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/service")
    public String service(){
        return "service";
    }

    @GetMapping("/workspace")
    public String workspace(){
        return "workspace";
    }

    @GetMapping("/board")
    public String board(){
        return "board";
    }

    @GetMapping("/join")
    public String join(){
        return "MemJoin&Login";
    }

   @GetMapping("/music")
    public String music(){
        return "music";
    }

    @GetMapping("/MemJoinLogin")
    public String MemJoinLogin(){
        return "MemJoin&Login";
    }

    @GetMapping("/Boa_View")
    public String Boa_View(){
        return "Boa_View";
    }

    @GetMapping("/Mem_Notice")
    public String Mem_Notice(){
        return "Mem_Notice";
    }

    @GetMapping("/Pay_PayMembership")
    public String Pay_PayMembership(){
        return "Pay_PayMembership";
    }

    @GetMapping("Mem_ReportList")
    public String Mem_ReportList() { return "Mem_ReportList";}

    @GetMapping("/Mem_List")
    public String Mem_List() { return "Mem_List";}

    @GetMapping("/Mem_StaffList")
    public String Mem_StaffList() { return "Mem_StaffList";}

    @GetMapping("/Dra_Write")
    public String Dra_Write(){ return "Dra_Write";}


    @GetMapping("/Pay_Membership")
    public String Pay_Membership(){
        return "Pay_Membership";
    }

    @GetMapping("/Pay_pay")
    public String Pay_pay(){
        return "Pay_pay";
    }

    @GetMapping("/Pro_Profile")
    public String Pro_Profile(){

        return "Pro_Profile";
    }
    @GetMapping("/Pro_LogReport")
    public String Pro_LogReport(){

        return "Pro_LogReport";
    }
    @GetMapping("/Pay_ASaleInfo")
    public String Pay_ASaleInfo(){

        return "Pay_ASaleInfo";
    }

}
