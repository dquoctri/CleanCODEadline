package com.dqtri.clean.handbook.functions;

public class ExtractTryCatchBlocks {
    //Try/catch blocks are ugly in their own right. They confuse the structure of the code and
    //mix error processing with normal processing. So it is better to extract the bodies of the try
    //and catch blocks out into functions of their own.


    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }



    Registry registry;
    ConfigKeys configKeys;

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name);
    }
    private void logError(Exception e) {
//        logger.log(e.getMessage());
    }

    private void deletePage(Page page){

    }

    class Page{
        String name;
    }

    class Registry {
        void deleteReference(String name){}
    }

    class ConfigKeys{
        void deleteKey(String name){}
    }

     enum Error {
        OK,
        INVALID,
        NO_SUCH,
        LOCKED,
        OUT_OF_RESOURCES,
        WAITING_FOR_EVENT;
    }
}
