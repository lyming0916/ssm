package service;

import dao.RenMapper;

public class RenServiceImpl implements RenService{
    private RenMapper renMapper;

    public void setRenMapper(RenMapper renMapper) {
        this.renMapper = renMapper;
    }

    @Override
    public String Password(String Id) {
        return renMapper.Password(Id);
    }
}
