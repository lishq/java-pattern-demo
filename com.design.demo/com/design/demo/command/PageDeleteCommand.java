package com.design.demo.command;

public class PageDeleteCommand extends Command {

    @Override
    public void execute() {
        super.pageGroup.find();

        super.pageGroup.plan();

        super.pageGroup.delete();

        super.codeGroup.delete();
    }
}
