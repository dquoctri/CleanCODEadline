package com.dqtri.clean.handbook.functions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PreferExceptionsToReturningErrorCodes {


    //if (deletePage(page) == E_OK

    Error errorDeletePage(Page page) {
        if (deletePage(page) == Error.E_OK) {
            if (registry.deleteReference(page.name) == Error.E_OK) {
                if (configKeys.deleteKey(page.name) == Error.E_OK) {
                    log.info("page deleted");
                    return Error.E_OK;
                } else {
                    log.info("configKey not deleted");
                }
            } else {
                log.info("deleteReference from registry failed");
            }
        } else {
            log.info("delete failed");
            return Error.E_ERROR;
        }
        return Error.E_ERROR;
    }

    Error deletePage(Page page) {
        return Error.E_OK;
    }


    void tryDeletePage(Page page) {
        try {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(page.name);
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    Registry registry;
    ConfigKeys configKeys;

    class Page {
        String name;
    }

    class Registry {
        Error deleteReference(String name) {
            return Error.E_OK;
        }
    }

    class ConfigKeys {
        Error deleteKey(String name) {
            return Error.E_OK;
        }
    }

    enum Error {
        E_OK,
        E_ERROR;
    }
}
