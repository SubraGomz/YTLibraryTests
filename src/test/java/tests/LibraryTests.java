package tests;

import handlers.BaseTestClass;
import handlers.CommonHandler;
import org.testng.annotations.Test;

import static constants.LibraryConstants.*;

public class LibraryTests extends BaseTestClass{
    @Test(priority = 1)
    public void createLibraryTest(){
        CommonHandler.clickByXPath(libraryXpath);
        CommonHandler.clickByXPath(newLibraryBtnXpath);
        CommonHandler.clickByID(youTubeID+nextButton);
        CommonHandler.sendKeysByID(name , libraryName);
        CommonHandler.clickByID(youTubeID+createButton);
    }
    @Test(priority = 2)
    public void readLibraryTest(){
        CommonHandler.clickByXPath(libraryXpath);
        CommonHandler.checkByID(youTubeID+squareAvatar);
    }
    @Test(priority = 3)
    public void updateLibraryNameTest(){
        CommonHandler.clickByXPath(libraryXpath);
        CommonHandler.clickByID(youTubeID+squareAvatar);
        CommonHandler.clickByID(youTubeID+editBtn);
        CommonHandler.clearID(youTubeID+editTitle);
        CommonHandler.sendKeysByID(youTubeID+editTitle, updateLibraryName);
        CommonHandler.clickByID(youTubeID+savePlaylist);
    }
    @Test(priority = 4)
    public void deleteLibraryTest(){
       CommonHandler.clickByXPath(libraryXpath);
        CommonHandler.clickByID(youTubeID+squareAvatar);
        CommonHandler.clickByAccessibilityID(moreOptions);
       CommonHandler.clickByXPath(deleteLibraryBtnXpath);
        CommonHandler.clickByID(deleteConfirmBtn);

    }

}
