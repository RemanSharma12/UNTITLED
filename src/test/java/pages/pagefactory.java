package pages;

public class pagefactory {
    WebDriver driver;
    private  dashboardpage dshboard;
    public pagefactory(WebDriver driver){
        this.driver=driver;
    }
    public dashboardpage getDshboard(){
        dashboardpage dashboardpage;
        if(dashboardpage==null){
            dashboardpage = new dashboardpage()(driver);
        }
        return dashboardpage;
    }
